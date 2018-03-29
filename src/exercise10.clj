(ns exercise10)

(defn faverage
    "Returns the average of a list or vector."
    [x]
     (/ (reduce + 0 x) (count x))
)

(defn square
    "Returns the square of a number."
    [x]
     (* x x)
)

(defn avgdiff
    "Returns a list wich contains the difference between the avg value and xi."
    [x]
     (map - (repeat (faverage x)) x)
)

(defn fvariance
    "Returns the variance of a list of numbers."
    [x]
    (/ (reduce +  0 (map square (avgdiff x))) (count x)) 
)

