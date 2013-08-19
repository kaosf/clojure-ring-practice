(ns hello-world.core
  (:use (ring.adapter jetty)))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str
     "<ul>\n"
     (apply str (map #(str "<li>" % "</li>\n") (seq request)))
     "</ul>\n")})

(defn main []
  (run-jetty handler {:port 3000}))
