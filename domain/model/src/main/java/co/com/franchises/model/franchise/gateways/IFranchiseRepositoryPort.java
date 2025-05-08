package co.com.franchises.model.franchise.gateways;

import co.com.franchises.model.franchise.model.Franchise;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFranchiseRepositoryPort {
    Mono<Franchise> save(Franchise franchise);
    Mono<Franchise> findById(String franchiseId);
    Flux<Franchise> findAll();
    Mono<Void> DeleteById(String franchiseId);
}
