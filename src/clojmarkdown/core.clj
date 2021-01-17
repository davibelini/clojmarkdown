(ns clojmarkdown.core
  (:gen-class))

(load-file "src/clojmarkdown/lexer.clj")

(defn -main
  [& args]
  (def content (seq (slurp "examples/number1.md")))   ;; path passed in slurp or spit is always the project root path
  (get-tokens content)
  (0))