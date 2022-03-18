package guru.springframework.importexportexcel.web.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2/import")
public class ImportResourceController {

    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    public String importExcel() {
        return "Import excel controller works!!!";
    }
}
