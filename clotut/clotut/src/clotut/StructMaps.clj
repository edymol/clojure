(ns clotut.StructMaps)

(defn Pets
  "Deprecated pet map"
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "Fido"))
  (println myPet)
  )

(Pets)

(defn Pets1
  "Create and print a pet map."
  []
  (let [myPet {:PetType "cat" :PetName "Gliford"}]
    (println myPet)))

(Pets1)

(defrecord Pet [PetType PetName])

(defn Pets2
  "Create and print a pet record."
  []
  (let [myPet (->Pet "bird" "Fenix")]
    (println myPet))
  (def otherPet (struct-map pet :PetName "Rino" :PetType "bird"))
  (println otherPet)
  (println (:PetType otherPet))
  (println (:PetName myPet))
  ;Changing struct maps information

  (def myNewPet (assoc myPet :PetName "Remo"))
  (println myNewPet)
  ;associating a new key in struct-map

  (def myNewPet1 (assoc myNewPet :PetAge 10))
  (println myNewPet1)
  )

(Pets2)


