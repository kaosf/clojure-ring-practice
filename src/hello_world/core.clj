(ns hello-world.core
  (:use (ring.adapter jetty)))

(use 'hiccup.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html
     [:table
       [:tr [:th "key"] [:th "value"]]
       (map (fn [[k v]] [:tr [:td k] [:td (str v)]]) (seq request))])})

(defn main []
  (run-jetty handler {:port 3000}))
