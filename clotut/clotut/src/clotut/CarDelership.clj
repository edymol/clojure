(ns clotut.CarDelership)

(defn isCodeValid
  "Check for code validity"
  [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20Percent" 0.8))
  (if (= (:Name validCoupon) code)
    true
    false)
  )

(defn Cars
  "This is the car price data"
  [budget code]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})
  (if (isCodeValid code)
    (do
      (println "The code is valid")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (def priceDiscount (* price discount))
        (if (<= priceDiscount budget)
          (println "The" carType "costs" priceDiscount)))
      )
    (do
      (println "The code is invalid")
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (if (<= price budget)
          (println "The" carType "costs" price)
          )
        )
      )
    )
  )
(Cars 50000 "20Percents")
