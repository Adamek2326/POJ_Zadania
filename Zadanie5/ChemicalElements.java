public class ChemicalElements {
    // has a unique symbolic name and atomic number
    private String name;
    private String symbolicName;
    private int atomicNumber;

    public ChemicalElements(String name, String symbolicName, int atomicNumber) {
        this.name = name;
        this.symbolicName = symbolicName;
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbolicName() {
        return this.symbolicName;
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    // Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87

    public boolean isAnAkaliMetal() {
        return this.atomicNumber == 3 ||
                this.atomicNumber == 11 ||
                this.atomicNumber == 19 ||
                this.atomicNumber == 37 ||
                this.atomicNumber == 55 ||
                this.atomicNumber == 87;

    }

    // Transition metals are all chemical elements with atomic number from 21 to 31,
    // 39 to 48, 72 to 80, and 104 to 112.
    public boolean isATransitionMetal() {
        return (this.atomicNumber >= 21 && this.atomicNumber <= 31) ||
                (this.atomicNumber >= 39 && this.atomicNumber <= 48) ||
                (this.atomicNumber >= 72 && this.atomicNumber <= 80) ||
                (this.atomicNumber >= 104 && this.atomicNumber <= 112);
    }

    // Metals are all chemical elements with atomic number 13, 49, 50, 81,
    // 82, 83, 113, 114, 115 or 116.
    public boolean isMetal() {
         return this.atomicNumber == 13 || this.atomicNumber == 49 ||
                this.atomicNumber == 50 || this.atomicNumber == 81 ||
                this.atomicNumber == 82 || this.atomicNumber == 83 ||
                this.atomicNumber == 113 || this.atomicNumber == 114 ||
                this.atomicNumber == 115 || this.atomicNumber == 116;
    }
    
}