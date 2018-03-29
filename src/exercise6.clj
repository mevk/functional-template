(ns exercise6)

(defn faverage
    "Returns the average of a list or vector."
    [x]
     (/ (reduce + 0 x) (count x))
)

