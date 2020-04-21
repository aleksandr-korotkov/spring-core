package org.shop;

import org.shop.annotations.InjectRandomInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer {

    @InjectRandomInt(minValue = -16, maxValue =  48)
    int randomInt;

    /** The seller initializer. */
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    private UserInitializer userInitializer;

    /**
     * Inits the data.
     */
    @PostConstruct
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }

    @Autowired
    public void setSellerInitializer(@Qualifier("sellerInitializer") SellerInitializer sellerInitializer) {
        this.sellerInitializer = sellerInitializer;
    }

    @Autowired
    public void setProductInitializer(@Qualifier("productInitializer") ProductInitializer productInitializer) {
        this.productInitializer = productInitializer;
    }

    @Autowired
    public void setProposalInitializer(@Qualifier("proposalInitializer") ProposalInitializer proposalInitializer) {
        this.proposalInitializer = proposalInitializer;
    }

    @Autowired
    public void setUserInitializer(@Qualifier("userInitializer") UserInitializer userInitializer) {
        this.userInitializer = userInitializer;
    }
}
