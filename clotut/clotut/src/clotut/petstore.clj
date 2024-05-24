(ns clotut.petstore)

(defn pet-to-human-age
  "This function returns the age ratio of a pet type in human years."
  [x]
  (let [pet-store {'dog 7, 'cat 5, 'goldfish 10}]
    (get pet-store x)))

(defn age
  "This function returns the age of a pet in human years."
  [pet-name pet-type pet-age]
  (let [ratio (pet-to-human-age pet-type)]
    (println pet-name "is" (* ratio pet-age) "years in human age")))

(age "Fido" 'dog 4)
(age "Fifi" 'dog 2)
(age "Bubbles" 'goldfish 10)
