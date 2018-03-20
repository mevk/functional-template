(ns exercise2)

(defn only-greater-than-five
  "Return list of items greater than five."
  [x]
  (filter (fn [y] (< 5 y)) x))

