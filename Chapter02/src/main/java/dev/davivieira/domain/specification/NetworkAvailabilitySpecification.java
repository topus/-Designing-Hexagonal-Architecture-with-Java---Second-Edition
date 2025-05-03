package dev.davivieira.domain.specification;

import dev.davivieira.domain.entity.Router;
import dev.davivieira.domain.vo.IP;
import dev.davivieira.domain.vo.Network;

public final class NetworkAvailabilitySpecification extends AbstractSpecification<Router> {

    private final Network theNetwork;


    public NetworkAvailabilitySpecification(Network theNetwork) {
        this.theNetwork = theNetwork;

    }

    @Override
    public boolean isSatisfiedBy(Router router) {
        return router!=null && isNetworkAvailable(router);
    }

    private boolean isNetworkAvailable(Router router) {
        return router.retrieveNetworks().stream().noneMatch(
                aNetwork -> aNetwork.equals(theNetwork);
    }
}
