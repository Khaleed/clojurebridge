(def height-in-inches (* 6 12))

(def height-in-cm (* height-in-inches 2.54))

(def total-height-in-cm (+ 175 158))

(def avg-height-in-cm (/ total-height-in-cm 2))

(def double-avg-height-in-cm (bigdec avg-height-in-cm))

(def convert-avg-height-to-inches (/ avg-height-in-cm 2.54))

(def covert-avg-height-to-feet (/ convert-avg-height-to-inches 12))