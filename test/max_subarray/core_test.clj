(ns max-subarray.core-test
  (:require [clojure.test :refer :all]
            [max-subarray.core :refer :all]))

(deftest max-subarray-test1
  (testing "Example array: [ 1, 3, -8, 2, -1, 10, -9 ]"
    (is (= (max-subarray '(1, 3, -8, 2, -1, 10, -9)) '(3 5)))))

(deftest max-subarray-test2
  (testing "Example array: [ 1, 3, -8 ]"
    (is (= (max-subarray '(1, 3, -8)) '(0 1)))))

(deftest max-subarray-test3
  (testing "Example array: [ 1, 3, -8, 2 ]"
    (is (= (max-subarray '(1, 3, -8, 2)) '(0 1)))))
