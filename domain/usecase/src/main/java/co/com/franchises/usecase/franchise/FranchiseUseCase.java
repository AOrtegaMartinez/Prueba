package co.com.franchises.usecase.franchise;

import co.com.franchises.model.franchise.gateways.IFranchiseRepositoryPort;
import co.com.franchises.model.franchise.model.Franchise;
import co.com.franchises.usecase.franchise.port.IFranchiseServicePort;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class FranchiseUseCase implements IFranchiseServicePort {
    private final IFranchiseRepositoryPort repository;

    @Override
    public Mono<Franchise> createFranchise(Franchise franchise) {
        return repository.save(franchise);
    }

    @Override
    public Mono<Franchise> getFranchiseById(String franchiseId) {
        return repository.findById(franchiseId);
    }

    @Override
    public Flux<Franchise> getAllFranchise() {
        return repository.findAll();
    }
}
