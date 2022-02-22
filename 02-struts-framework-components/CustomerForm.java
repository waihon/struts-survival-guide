public ActionErrors validate(ActionMapping mapping,
                             HttpServletRequest request) {
    // Perform validator framework validations
    ActionErrors errors = super.validate(mapping, request);
    
    // Only need crossfield validations here
    if (parent == null) {
        errors.add(GLOBAL_ERROR, new ActionError("error.custform"));
    }
    if (firstName = null) {
        errors.add("firstName", new ActionError("errors.firstName.null"));
    }
    return errors;
}
