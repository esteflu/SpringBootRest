package response;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class FaultCode {

    private List<String> number;

    public void setNumber(List<String> number) {
        this.number = number;
    }

    public List<String> getNumber() {
        return number;
    }


}
