package org.rapidpm.vaadin.sapui5.demo.backend

import java.util.ArrayList


class BackendService {

  private var employees: MutableList<Employee>? = null

  init {
    // Init dummy data
    employees = ArrayList()
    employees!!.add(Employee("Rowena", "Leeming", "rleeming0@bbc.co.uk", "Food Chemist"))
    employees!!.add(Employee("Alvinia", "Delong", "adelong1@altervista.org", "Recruiting Manager"))
    employees!!.add(Employee("Leodora", "Burry", "lburry2@example.com", "Food Chemist"))
    employees!!.add(Employee("Karen", "Oaten", "koaten3@ihg.com", "VP Sales"))
    employees!!.add(Employee("Mariele", "Huke", "mhuke4@washingtonpost.com", "Research Assistant IV"))
    employees!!.add(Employee("Grata", "Widdowes", "gwiddowes5@cargocollective.com", "Actuary"))
    employees!!.add(Employee("Donna", "Roadknight", "droadknight6@apache.org", "Mechanical Systems Engineer"))
    employees!!.add(Employee("Tommi", "Nowland", "tnowland7@biblegateway.com", "Senior Developer"))
    employees!!.add(Employee("Tonya", "Teresia", "tteresia8@boston.com", "Assistant Manager"))
    employees!!.add(Employee("Steffen", "Yon", "syon9@ocn.ne.jp", "Senior Sales Associate"))
    employees!!.add(Employee("Consalve", "Willes", "cwillesa@linkedin.com", "Programmer I"))
    employees!!.add(Employee("Jeanelle", "Lambertz", "jlambertzb@nymag.com", "Operator"))
    employees!!.add(Employee("Odelia", "Loker", "olokerc@gov.uk", "Developer I"))
    employees!!.add(Employee("Briano", "Shawell", "bshawelld@posterous.com", "Research Assistant IV"))
    employees!!.add(Employee("Tarrance", "Mainston", "tmainstone@cmu.edu", "Research Nurse"))
    employees!!.add(Employee("Torrence", "Gehring", "tgehringf@a8.net", "Geological Engineer"))
    employees!!.add(Employee("Augie", "Pionter", "apionterg@ehow.com", "Senior Financial Analyst"))
    employees!!.add(Employee("Marillin", "Aveson", "mavesonh@shop-pro.jp", "Technical Writer"))
    employees!!.add(Employee("Jacquelyn", "Moreby", "jmorebyi@slashdot.org", "Executive Secretary"))
    employees!!.add(Employee("Glenn", "Bangley", "gbangleyj@prlog.org", "Account Executive"))
    employees!!.add(Employee("Isidoro", "Glave", "iglavek@tamu.edu", "Compensation Analyst"))
    employees!!.add(Employee("Cchaddie", "Spatarul", "cspatarull@sun.com", "Business Systems Development Analyst"))
  }

  fun getEmployees(): List<Employee>? {
    return employees
  }

}
