(ns hello-world.core
  (:use (ring.adapter jetty)))

(use 'hiccup.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html
     [:table
       [:tr [:th "key"] [:th "value"]]
       (for [[k v] (seq request)] [:tr [:td k] [:td (str v)]])])})

(defn main []
  (run-jetty handler {:port 3000}))
