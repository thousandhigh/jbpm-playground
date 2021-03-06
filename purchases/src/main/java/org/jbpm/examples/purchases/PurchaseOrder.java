package org.jbpm.examples.purchases;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Purchase Order")
public class PurchaseOrder  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Total")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Double total;
    
    @org.kie.api.definition.type.Label(value = "Description")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String description;
    
    @org.kie.api.definition.type.Label(value = "Lines")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<org.jbpm.examples.purchases.PurchaseOrderLine> lines;
    
    @org.kie.api.definition.type.Label(value = "Header")
    @org.kie.api.definition.type.Position(value = 1)
    private org.jbpm.examples.purchases.PurchaseOrderHeader header;
    
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.Boolean requiresCFOApproval;

    public PurchaseOrder() {
    }

    public PurchaseOrder(java.lang.String description, org.jbpm.examples.purchases.PurchaseOrderHeader header, java.util.List<org.jbpm.examples.purchases.PurchaseOrderLine> lines, java.lang.Double total, java.lang.Boolean requiresCFOApproval) {
        this.description = description;
        this.header = header;
        this.lines = lines;
        this.total = total;
        this.requiresCFOApproval = requiresCFOApproval;
    }


    
    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(  java.lang.Double total ) {
        this.total = total;
    }
    
    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(  java.lang.String description ) {
        this.description = description;
    }
    
    public java.util.List<org.jbpm.examples.purchases.PurchaseOrderLine> getLines() {
        return this.lines;
    }

    public void setLines(  java.util.List<org.jbpm.examples.purchases.PurchaseOrderLine> lines ) {
        this.lines = lines;
    }
    
    public org.jbpm.examples.purchases.PurchaseOrderHeader getHeader() {
        return this.header;
    }

    public void setHeader(  org.jbpm.examples.purchases.PurchaseOrderHeader header ) {
        this.header = header;
    }
    
    public java.lang.Boolean getRequiresCFOApproval() {
        return this.requiresCFOApproval;
    }

    public void setRequiresCFOApproval(  java.lang.Boolean requiresCFOApproval ) {
        this.requiresCFOApproval = requiresCFOApproval;
    }




}
