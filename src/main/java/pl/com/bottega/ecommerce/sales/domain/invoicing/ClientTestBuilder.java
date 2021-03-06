package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;


public class ClientTestBuilder  implements  ClientTestBuilderInterface {

    private Id id;
    private String name;

    @Override
    public void setId(Id id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ClientData build() {
        return new ClientData(id, name);
    }
}