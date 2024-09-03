package org.alfa.alfa_house.specifications;

import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class PostSpecificationBuilder {
    List<SearchCriteria> specifications;

    public PostSpecificationBuilder() {
        specifications = new ArrayList<SearchCriteria>();
    }

    public final PostSpecificationBuilder addSpecification(String key, String operation, Object value) {
        if (!key.isEmpty() || !operation.isEmpty() || value != null) {
            specifications.add(new SearchCriteria(key, operation, value));
        }
        return this;
    }

    public Specification build() {
        if (specifications.isEmpty()) {
            return null;
        }

        Specification result = new PostSpecification(specifications.get(0));

        for (SearchCriteria specification : specifications) {
            result = specification.isOrPredicate()
                    ? Specification.where(result).or(new PostSpecification(specification))
                    : Specification.where(result).and(new PostSpecification(specification));
        }

        return result;
    }
}
