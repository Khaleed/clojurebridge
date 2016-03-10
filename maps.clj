; model yourself
; learning about maps
(def me {:first "Khalid" :middle "Omar" :last "Ali"})
(merge me {:hometown "London"} {:sports "martial arts"})
; exercise model classmates
(def classmates [{:first "Joe" :last "Bloggs" :hometown "NYC"}{:first "Jane" :last "Doe"  :hometown "Boston"}{:first "Malcolm" :last "X" :hometown "Jamaica"}])
; add your map to classmates vector
(conj classmates me)
