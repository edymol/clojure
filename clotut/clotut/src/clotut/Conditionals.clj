(ns clotut.Conditionals)

(defn conf-if
  []
  (println "\nCondIf:")
  (if (= 5 5)
    (println "Equal")
    (println "Not Equal")
    ))
(conf-if)

(defn cond-if-do
  []
  (println "\nCondIfDo:")
  (if (= 5 6)
    (do (println "Equals")
        (println "First statement"))
    (do (println "Not Equals")
        (println "Second statement"))
    ))
(cond-if-do)

(defn cond-nested-if
  []
  (println "\nCondNested:")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "True")
    (println "False")))

(cond-nested-if)

(defn cond-case
  "Conditional or switch case"
  [pet]
  (println "\nCond-case")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")
    ))
(cond-case "dog")

(defn cond-cond
  "Cond conditional "
  [amount]
  (println "\nCond-cond")
  (cond
    (<= amount 2) (println "Few")
    (<= amount 10) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "Loads")
    ))
(cond-cond 101)