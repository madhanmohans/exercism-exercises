class RnaTranscription {

    String transcribe(String dnaStrand) {

        if(dnaStrand.length() == 0 ) return "";

        String head = transcribeOnePart(dnaStrand.substring(0, 1));
        String tail = transcribe(dnaStrand.substring(1));

        return head + tail;
    }

    String transcribeOnePart(String onePart) {
        switch(onePart) {
            case "G": return "C";
            case "C": return "G";
            case "T": return "A";
            case "A": return "U";
        }
        throw new IllegalArgumentException("Invalid Input");
    }
}
