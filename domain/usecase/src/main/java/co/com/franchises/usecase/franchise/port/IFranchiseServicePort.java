package co.com.franchises.usecase.franchise.port;

import co.com.franchises.model.franchise.model.Franchise;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFranchiseServicePort {
    Mono<Franchise> createFranchise(Franchise franchise);
    Mono<Franchise> getFranchiseById(String franchiseId);
    Flux<Franchise> getAllFranchise();
}
