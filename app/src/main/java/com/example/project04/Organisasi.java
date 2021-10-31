package com.example.project04;

public class Organisasi
{



        private String organisasi,negara,unit;
        private int gambar;
        public Organisasi(String organisasi, String negara, String unit, int gambar) {
            this.organisasi = organisasi;
            this.negara= negara;
            this.unit = unit;
            this.gambar = gambar;
        }
        public String getOrganisasi() {
            return organisasi;
        }
        public void setOrganisasi(String organisasi) {
            this.organisasi = organisasi;
        }
        public String getNegara() {
            return negara;
        }
        public void setNegara(String negara) {
            this.negara = negara;
        }
        public String getUnit() {
            return unit;
        }
        public void setUnit(String unit) {
            this.unit = unit;
        }
        public int getGambar() {
            return gambar;
        }
        public void setGambar(int gambar) {
            this.gambar = gambar;
        }


}
