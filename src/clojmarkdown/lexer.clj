(ns clojmarkdown.lexer
  (:gen-class))

(defn get-tokens [src]
  (doseq [chr [src]]
  (println chr)))