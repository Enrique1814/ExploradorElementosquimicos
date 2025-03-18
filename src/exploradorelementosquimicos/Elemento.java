/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploradorelementosquimicos;

/**
 *
 * @author MAURO
 */
public class Elemento {
    private String nmbre;
    private int natomico;//numero atomico
    private double pesoAtomico;
    private String simbolo;
    private int[] niveleselectronicos;
    private int[]estafoOxidación;
   private double masaAtomica;
   private int distribucionElectronesOrbitas;

    public String getNmbre() {
        return nmbre;
    }

    public void setNmbre(String nmbre) {
        this.nmbre = nmbre;
    }

    public int getNatomico() {
        return natomico;
    }

    public void setNatomico(int natomico) {
        this.natomico = natomico;
    }

    public double getPesoAtomico() {
        return pesoAtomico;
    }

    public void setPesoAtomico(double pesoAtomico) {
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int[] getNiveleselectronicos() {
        return niveleselectronicos;
    }

    public void setNiveleselectronicos(int[] niveleselectronicos) {
        this.niveleselectronicos = niveleselectronicos;
    }

    public int[] getEstafoOxidación() {
        return estafoOxidación;
    }

    public void setEstafoOxidación(int[] estafoOxidación) {
        this.estafoOxidación = estafoOxidación;
    }

    public double getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public int getDistribucionElectronesOrbitas() {
        return distribucionElectronesOrbitas;
    }

    public void setDistribucionElectronesOrbitas(int distribucionElectronesOrbitas) {
        this.distribucionElectronesOrbitas = distribucionElectronesOrbitas;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getAnioDescubrimiento() {
        return anioDescubrimiento;
    }

    public void setAnioDescubrimiento(int anioDescubrimiento) {
        this.anioDescubrimiento = anioDescubrimiento;
    }
   private int periodo;
   private int serie;
   private int grupo;
   private String familia;
   private String estado;
   private String notas;
   private int anioDescubrimiento;
}
