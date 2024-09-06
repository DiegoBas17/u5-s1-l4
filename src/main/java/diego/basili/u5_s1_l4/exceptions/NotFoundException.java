package diego.basili.u5_s1_l4.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id){
        super("Il record con id " + id + " non è stato trovato!");
    }
}