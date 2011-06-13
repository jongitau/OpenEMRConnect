/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is OpenEMRConnect.
 *
 * The Initial Developer of the Original Code is International Training &
 * Education Center for Health (I-TECH) <http://www.go2itech.org/>
 *
 * Portions created by the Initial Developer are Copyright (C) 2011
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */
package ke.go.moh.oec.reception.data;

import java.util.ArrayList;
import java.util.List;
import ke.go.moh.oec.Person.MaritalStatus;

/**
 *
 * @author Gitahi Ng'ang'a
 */
public class DisplayableMaritalStatus {

    private MaritalStatus maritalStatus;
    private String displayString;

    public DisplayableMaritalStatus(MaritalStatus maritalStatus, String displayString) {
        this.maritalStatus = maritalStatus;
        this.displayString = displayString;
    }

    public String getDisplayString() {
        return displayString;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return displayString;
    }

    public static List<DisplayableMaritalStatus> getList() {
        List<DisplayableMaritalStatus> displayableMaritalStatuseList =
                new ArrayList<DisplayableMaritalStatus>();
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.single, "Single"));
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.marriedPolygamous, "Married Polygamous"));
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.marriedMonogamous, "Married Monogamous"));
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.divorced, "Divorced"));
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.widowed, "Widowed"));
        displayableMaritalStatuseList.add(new DisplayableMaritalStatus(MaritalStatus.cohabitating, "Cohabitating"));
        return displayableMaritalStatuseList;
    }
}
