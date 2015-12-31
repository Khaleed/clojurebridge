; calculate average height of three people in cm
(def height-in-inches (* 6 12))
(def height-in-inches (* 6 12))
(def height-from-inches-to-centimetres (* height-in-inches 2.54))
(def height-person1 174)
(def height-person2 192)
(def total-height-in-cm (+ height-from-inches-to-centimetres height-person1 height-person2))
(def avg-height-in-cm (/ total-height-in-cm 3))
; convert back to inches
(def convert-height-back-to-inches (/ avg-height-in-cm 2.54))
; convert back to feet
(def convert-height-back-to-feet (/ convert-back-to-feet 12))
