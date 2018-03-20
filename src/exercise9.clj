(ns exercise9)

(defn things
    "Returns the type legend (String, Vector, Map, Others(Default))."
    [x]
    (cond
    (string? x) "Soy un String"
    (vector? x) "Soy un Vector"
    (map? x) "Soy un Map"
    :else "Soy un default")
)

