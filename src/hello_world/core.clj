(ns hello-world.core
  (:require [ring.adapter.jetty :refer (run-jetty)]
            [hiccup.core :refer (html)]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (html
     [:table
       [:tr [:th "key"] [:th "value"]]
       (for [[k v] (seq request)] [:tr [:td k] [:td (str v)]])])})

(defn main []
  (run-jetty handler {:port 3000}))
