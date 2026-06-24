package com.siakad;

import java.util.List;

public class DataKRS {
    private String mahasiswaId;
    private List<MataKuliah> mataKuliahList;

    public DataKRS(String mahasiswaId, List<MataKuliah> mataKuliahList) {
        this.mahasiswaId = mahasiswaId;
        this.mataKuliahList = mataKuliahList;
    }
    
    public String getMahasiswaId() { return mahasiswaId; }
    public List<MataKuliah> getMataKuliahList() { return mataKuliahList; }
}
