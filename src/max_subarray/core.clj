; Solves the maximum subarray problem:
; http://en.wikipedia.org/wiki/Maximum_subarray_problem

(ns max-subarray.core)

(defn find-max-subarray
	"Helper function that finds the maximum subarray given a maximum subarray found so far by iterating over an array."
	[a i max_sum max_begin max_end sum sum_begin]
	(if (empty? a)
		(list max_begin max_end)
		(let [new_sum (+ sum (first a))] ; could it be done without using "let" here?
			(if (> new_sum max_sum)
				(find-max-subarray (rest a) (inc i) new_sum sum_begin i new_sum sum_begin)
				(if (< new_sum 0) ; the second comparision will not work well if we have an array with only negative numbers
					(find-max-subarray (rest a) (inc i) max_sum max_begin max_end 0 (inc i))
					(find-max-subarray (rest a) (inc i) max_sum max_begin max_end new_sum sum_begin))))))


(defn max-subarray
  "Returns begin and end index of the maximum subarray for a given array (passed here as a list)."
  [a]
  (find-max-subarray a 0 0 0 0 0 0))
