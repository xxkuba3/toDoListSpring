package xxkuba3.lang;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LangRepository extends JpaRepository<Lang, Integer>, JpaSpecificationExecutor<Lang> {
    // List<Lang> findByCodeAndWelcomeMsg(String code, String welcomeMsg);

}

