(ns project.core
  (:require [ring.middleware.reload :as reload] :reload-all))

(defn -main [& args]
  (println "Hey!"))
