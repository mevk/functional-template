(ns exercise11)

(defn fmap-nil
    "Returns if the map value associated with the key k is nil."
    [x k]
    (= (get x k) nil)
)

