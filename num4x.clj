;; #43
(map (fn [a] (map #(nth [:a :b :c :d] %) a)) [[0 2] [3 1]]))

(fn [a b] 
	(map (fn [c] (map #(nth a %) c
				 )
	       ) (vals (group-by  #(mod % b) (range (count a))) ) 
	)
)

;; #44
(fn [a b] (let [x (count b)
                y (+ (* 3 x) a)
                
                z (+ y x)]
            (drop y (take z (cycle b)))
            ) )

