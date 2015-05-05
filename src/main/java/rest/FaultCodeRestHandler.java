package rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import response.FaultCode;

import javax.ws.rs.core.MediaType;
import java.util.List;


@RestController
@RequestMapping("/faultcode")
public class FaultCodeRestHandler {

    @RequestMapping(value = "/{faultcodes}",
                    method = RequestMethod.GET,
                    produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML},
                    consumes = "application/mycustomheader")

    public FaultCode getTranslatedFaultCodes(@PathVariable("faultcodes")List<String> faultCodes) {

        FaultCode faultCode = new FaultCode();
        faultCode.setNumber(faultCodes);
        return faultCode;
    }
}
