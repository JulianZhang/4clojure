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

;;#46
#(fn [a b] (% b a))

;;#53

(fn f [a] (concat (last (sort-by #(count %)
	(reverse (filter #(> (count %) 1) 
	(reduce #(if (< (last (last %1)) %2)
	      (concat (butlast %1) [(concat (last %1) [%2])])
	      (concat %1 [[%2]])
	      )  [[99]] a
	)))
 )
) []))


