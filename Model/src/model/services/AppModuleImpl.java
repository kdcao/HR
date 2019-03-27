package model.services;


import model.queries.GehaltBerufungImpl;
import model.queries.GehaltJobsNationImpl;
import model.queries.GehaltNachBerufungImpl;
import model.queries.OrtAbteilungImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 25 08:58:05 CET 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl () {}

    /**
     * Container's getter for DepartmentsView1.
     * @return DepartmentsView1
     */
    public ViewObjectImpl getDepartmentsView1 () {
        return ( ViewObjectImpl ) findViewObject( "DepartmentsView1" );
    }

    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public ViewObjectImpl getEmployeesView1 () {
        return ( ViewObjectImpl ) findViewObject( "EmployeesView1" );
    }

    /**
     * Container's getter for DepartmentsView2.
     * @return DepartmentsView2
     */
    public ViewObjectImpl getDepartmentsView2 () {
        return ( ViewObjectImpl ) findViewObject( "DepartmentsView2" );
    }

    /**
     * Container's getter for EmployeesView2.
     * @return EmployeesView2
     */
    public ViewObjectImpl getEmployeesView2 () {
        return ( ViewObjectImpl ) findViewObject( "EmployeesView2" );
    }

    /**
     * Container's getter for EmployeesView3.
     * @return EmployeesView3
     */
    public ViewObjectImpl getEmployeesView3 () {
        return ( ViewObjectImpl ) findViewObject( "EmployeesView3" );
    }

    /**
     * Container's getter for DeptMgrFkLink1.
     * @return DeptMgrFkLink1
     */
    public ViewLinkImpl getDeptMgrFkLink1 () {
        return ( ViewLinkImpl ) findViewLink( "DeptMgrFkLink1" );
    }

    /**
     * Container's getter for EmpManagerFkLink1.
     * @return EmpManagerFkLink1
     */
    public ViewLinkImpl getEmpManagerFkLink1 () {
        return ( ViewLinkImpl ) findViewLink( "EmpManagerFkLink1" );
    }

    /**
     * Container's getter for EmpDeptFkLink1.
     * @return EmpDeptFkLink1
     */
    public ViewLinkImpl getEmpDeptFkLink1 () {
        return ( ViewLinkImpl ) findViewLink( "EmpDeptFkLink1" );
    }


    /**
     * Container's getter for OrtAbteilung1.
     * @return OrtAbteilung1
     */
    public OrtAbteilungImpl getOrtAbteilung1 () {
        return ( OrtAbteilungImpl ) findViewObject( "OrtAbteilung1" );
    }


    /**
     * Container's getter for GehaltNachBerufung1.
     * @return GehaltNachBerufung1
     */
    public GehaltNachBerufungImpl getGehaltNachBerufung1 () {
        return ( GehaltNachBerufungImpl ) findViewObject( "GehaltNachBerufung1" );
    }

    /**
     * Container's getter for GehaltBerufung1.
     * @return GehaltBerufung1
     */
    public GehaltBerufungImpl getGehaltBerufung1 () {
        return ( GehaltBerufungImpl ) findViewObject( "GehaltBerufung1" );
    }

    /**
     * Container's getter for GehaltJobsNation1.
     * @return GehaltJobsNation1
     */
    public GehaltJobsNationImpl getGehaltJobsNation1 () {
        return ( GehaltJobsNationImpl ) findViewObject( "GehaltJobsNation1" );
    }
}

