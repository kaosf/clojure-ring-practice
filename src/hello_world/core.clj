(ns hello-world.core
  (:use (ring.adapter jetty)))

(use 'hiccup.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str
     (html [:p "paragraph"])
     "<ul>\n"
     (apply str (map #(str "<li>" % "</li>\n") (seq request)))
     "</ul>\n")})

(defn main []
  (run-jetty handler {:port 3000}))
