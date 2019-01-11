package in.timemac.dictionary.repo;

import in.timemac.dictionary.model.Word;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryRepository extends CrudRepository<Word,String>{
     List<Word> findByWordItem(String wordItem);
}
