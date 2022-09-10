/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author hectorledez el gamer
 */
public class Calculo {
    
    /**
    private int PS;
    private int AT;
    private int DF;
    private int ATS;
    private int DFS;
    private int VEL;
    
    public int getPS() {
        return PS;
    }

    public int getAT() {
        return AT;
    }

    public int getDF() {
        return DF;
    }

    public int getATS() {
        return ATS;
    }

    public int getDFS() {
        return DFS;
    }

    public int getVEL() {
        return VEL;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public void setAT(int AT) {
        this.AT = AT;
    }

    public void setDF(int DF) {
        this.DF = DF;
    }

    public void setATS(int ATS) {
        this.ATS = ATS;
    }

    public void setDFS(int DFS) {
        this.DFS = DFS;
    }

    public void setVEL(int VEL) {
        this.VEL = VEL;
    }
    */
    private Random select = new Random();
    private int PS;
    private int AT;
    private int DF;
    private int ATS;
    private int DFS;
    private int VEL;
    private int Ppo;

    public int getPpo() {
        return Ppo;
    }
    
    

    public int getPS() {
        return PS;
    }

    public int getAT() {
        return AT;
    }

    public int getDF() {
        return DF;
    }

    public int getATS() {
        return ATS;
    }

    public int getDFS() {
        return DFS;
    }

    public int getVEL() {
        return VEL;
    }
    
    private int Rstat(int st){
        int res = 0;
        
        switch(st){
            case 1: res = 0;break;
            case 2: res = select.nextInt(15)+1;break;
            case 3: res = select.nextInt(10)+16;break;
            case 4: res = select.nextInt(4)+26;break;
            case 5: res = 30;break;
            case 6: res = 31;break;
        }
        return res;
    }
    
    private int[] ju(int j){
        int r[] = new int[2];
        switch(j){
            case 1:r[0]=0; r[1]=90; break;
            case 2:r[0]=91; r[1]=120; break;
            case 3:r[0]=121; r[1]=150; break;
            case 4:r[0]=151; r[1]=186; break;
        }
        return r;
    }
    /**
    
    
    private int[] sort(int[] r){
        
        int aux;
        for(int i = 1; i<r.length;i++){
            if(r[i] < r[i-1]){
                aux = r[i-1];
                r[i-1] = r[i];
                r[i] = aux;
            }
        }
        return r;
    }
    
    
    private int dif(int val, int[] ar){
        int [] res = new int[ar.length];
        for(int i = 0; i<ar.length;i++){
            res[i] = ar[i]-val;
        }
        
        int dife = 0;
        return dife;
    }
    */
    private int T(int PO){
        return ((PO-1)*63/15);
    }
    
    private boolean contiene(int[] arr, int key) {
        boolean esta = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                esta = true;
            }
        }
        return esta;
    }
    private int Pot(int ps,int at,int df,int ats,int dfs,int vel){
        int p = 0;
        if(ps%4 == 2 || ps%4 == 3){
            p += 1;
        }
        if(at%4 == 2 || at%4 == 3){
            p += 2;
        }
        if(df%4 == 2 || df%4 == 3){
            p += 4;
        }
        if(vel%4 == 2 || vel%4 == 3){
            p += 8;
        }
        if(ats%4 == 2 || ats%4 == 3){
            p += 16;
        }
        if(dfs%4 == 2 || dfs%4 == 3){
            p += 32;
        }
        return (p*40/63)+30;
    }
    //                   /                      (1-6)                 \, (1-4) ,(1-16),(1 - 30)
    public void calcular(int ps,int at,int def,int ats, int dfs,int vel,int juez,int po,int pers){
        System.out.println("Calculando");
        int IV1[] = {0,5,10,15,20,25,30};
        int IV2[] = {1,6,11,16,21,26,31};
        int IV3[] = {2,7,12,17,22,27};
        int IV4[] = {3,8,13,18,23,28};
        int IV5[] = {4,9,14,19,24,29};
        
        int IV[] = null;
        
        int statS = 0;
        int IVPO = 0;
        int IVT = 0;
        int min = ju(juez)[0];
        int max = ju(juez)[1];
        int t = T(po);
        while(t != IVPO && (min >= IVT || max <= IVT)){
            System.out.println("entra al 1er while\n\n");
            int sel;
            PS = Rstat(ps);
            AT = Rstat(at);
            DF = Rstat(def);
            ATS = Rstat(ats);
            DFS = Rstat(dfs);
            VEL = Rstat(vel);
            if(pers > 0 && pers <= 6){
                statS = pers;
                sel = select.nextInt(IV1.length);
                IV = IV1;
            }else if(pers > 6 && pers <= 12){
                statS = pers - 6;
                sel = select.nextInt(IV2.length);
                IV = IV2;
            }else if(pers > 12 && pers <= 18){
                statS = pers - 12;
                sel = select.nextInt(IV3.length);
                IV = IV3;
            }else if(pers > 18 && pers <= 24){
                statS = pers - 18;
                sel = select.nextInt(IV4.length);
                IV = IV4;
            }else if(pers > 24 && pers <= 30){
                statS = pers - 24;
                sel = select.nextInt(IV5.length);
                IV = IV5;
            }
            System.out.println("Se define IV: "+Arrays.toString(IV)+" y statS: "+statS+"\n");
            System.out.println("DF. Spe: "+DFS+"\n");
            System.out.println("esta en IV? "+(contiene(IV,DFS)));
            int aux;
            boolean sale = false;
            switch(statS){
                case 1:
                    
                    while(!contiene(IV,PS)){
                        PS = Rstat(ps);
                    }
                    break;
                case 2:
                    while(!contiene(IV,AT)){
                        AT = Rstat(at);
                    }
                    break;
                case 3:
                    while(!contiene(IV,DF)){
                        DF = Rstat(def);
                    }
                    break;
                case 4:
                    while(!contiene(IV,ATS)){
                        ATS = Rstat(ats);
                    }
                    break;
                case 5:
                    while(!contiene(IV,DFS)){
                        DFS = Rstat(dfs);
                    }
                    break;
                case 6:
                    while(!contiene(IV,VEL)){
                        VEL = Rstat(vel);
                    }
                    break;
            }
            //DFS = 29;
            IVT = PS+AT+DF+ATS+DFS+VEL;
            IVPO = 0;
            
            if(PS%2 != 0){
                IVPO += 1;
            }
            if(AT%2 != 0){
                IVPO += 2;
            }
            if(DF%2 != 0){
                IVPO += 4;
            }
            if(VEL%2 != 0){
                IVPO += 8;
            }
            if(ATS%2 != 0){
                IVPO += 16;
            }
            if(DFS%2 != 0){
                IVPO += 32;
            }
        }
        Ppo= Pot(PS,AT,DF,ATS,DFS,VEL);
        System.out.println( "PS:  "+PS+"\n"+
                            "AT:  "+AT+"\n"+
                            "DF:  "+DF+"\n"+
                            "ATS: "+ATS+"\n"+
                            "DFS: "+DFS+"\n"+
                            "VEL: "+VEL+"\n"+
                            "Total: "+IVT);
    }
    
}
