(ns exercise7)

(defn fmap
    "Apply user function over a list, vector or map."
    [f x]
    (if (map? x)
        (into {} (map (fn [[k v]] [k (f v)]) x))        
        (map f x)
    )
)
