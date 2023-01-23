package polymorphism;

class OrthopedicSurgicalCases{
    private final String name;

    public OrthopedicSurgicalCases(String name){
        this.name = name;
    }

    public String instruments(){
        return "No Instrumentation Needed!";
    }

    public String getName() {
        return name;
    }
}

class RotatorCuffRepair extends OrthopedicSurgicalCases{
    public RotatorCuffRepair() {
        super("Rotator Cuff Repair");
    }

    @Override
    public String instruments() {

        return "Arthrex Arthroscopic Instruments \n" +
                "#11 Knife Blade \n" +
                "#2 Ethicon FibreWire Suture";
    }
}

class SubacromialDecompression extends OrthopedicSurgicalCases{
    public SubacromialDecompression() {
        super("Subacromial Decompression");
    }

    @Override
    public String instruments() {
        return "Johnson & Johnson Arthroscopic Instruments \n" +
                "#11 Knife Blade \n" +
                "4-0 Ethilon Suture";
    }
}

class KneeScope extends OrthopedicSurgicalCases{
    public KneeScope() {
        super("Knee Scope");
    }

    @Override
    public String instruments() {

        return "3M Camera & 0 Deg Scope \n" +
                "Arthrex Agressive Shaver \n" +
                "Meniscal Probe";
    }
}

class DupuytrensContracture extends OrthopedicSurgicalCases{
    public DupuytrensContracture() {
        super("Dupuytren's Contracture");
    }

    @Override
    public String instruments() {

        return "Anesthesia: Bier Block \n" +
                "Microsurgical Instruments \n" +
                "Z-Plasty Inscision";
    }
}

class TotalKneeArthroplasty extends OrthopedicSurgicalCases{
    public TotalKneeArthroplasty() {
        super("Total Knee Arthroplasty");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            OrthopedicSurgicalCases surgicalCases = surgicalCases();
            System.out.println("Surgery #:" + i + " : " + surgicalCases.getName() + "\n"
                    + "Instruments: " + surgicalCases.instruments() + "\n");
        }
    }


    public static OrthopedicSurgicalCases surgicalCases(){
        int randomNumber = (int)(Math.random() * 5) + 1;

        switch (randomNumber){
            case 1:
                return new RotatorCuffRepair();
            case 2:
                return new SubacromialDecompression();
            case 3:
                return new KneeScope();
            case 4:
                return new DupuytrensContracture();
            case 5:
                return new TotalKneeArthroplasty();
            default:
                return null;
        }
    }
}