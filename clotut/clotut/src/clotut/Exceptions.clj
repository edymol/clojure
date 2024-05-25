(ns clotut.Exceptions
  (:import (com.sun.source.tree TryTree)))

(defn ExHandling
  "Handling exceptions in Clojure"
  [x]
  (try
     (inc x)
     (catch ClassCastException e
       (println "Caught exception:" (.getMessage e)))
     (catch Exception e
       (println "Caught generic exception " (.getMessage e)))
     (finally (println "Clean up and move on")))
  )
(ExHandling "hello")
