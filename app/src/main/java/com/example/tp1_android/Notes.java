package com.example.tp1_android;

    public class Notes {
        private String validation;
        private String label;
        private float score;

        public Notes(String validation, String label, float score) {
            this.validation = validation;
            this.label = label;
            this.score = score;
        }

        public String getValidation() {
            return validation;
        }

        public String getMatiere() {
            return label;
        }

        public float getNote() {
            return score;
        }

        public void setValidation(String validation) {
            this.validation = validation;
        }

        public void setMatiere(String label) {
            this.label = label;
        }

        public void setNote(float score) {
            this.score = score;
        }
    }

