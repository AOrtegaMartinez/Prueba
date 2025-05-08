package co.com.franchises.model.franchise.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Builder
public class Franchise {
    private String id;
    private String name;
    private List<Branch> branches;

    public Franchise(String id, String name, List<Branch> branches) {
        this.id = id;
        this.name = name;
        this.branches = branches;
    }
}


