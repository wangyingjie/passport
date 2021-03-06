package org.infinity.passport.repository;

import org.infinity.passport.domain.MongoOAuth2AuthorizationCode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuth2AuthorizationCodeRepository extends MongoRepository<MongoOAuth2AuthorizationCode, String> {

    MongoOAuth2AuthorizationCode findOneByCode(String code);
}
