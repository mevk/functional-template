(ns exercise8)

(defn fderive
    "Does approximate the derive of certain function."
    [f h]
    (fn [v]
        (/ (- (f (+ v h)) (f (- v h))) (* 2 h))
    )
)
