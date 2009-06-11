package fi.hut.soberit.agilefant.business;

import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import fi.hut.soberit.agilefant.model.ExactEstimate;
import fi.hut.soberit.agilefant.model.Iteration;
import fi.hut.soberit.agilefant.model.IterationHistoryEntry;

public interface IterationHistoryEntryBusiness extends
        GenericBusiness<IterationHistoryEntry> {

    void updateIterationHistory(int iterationId);

    public ExactEstimate getLatestOriginalEstimateSum(Iteration iteration);
    
    /**
     * Gets history days grouped by dates.
     * <p>
     * Will get data from <code>startDates</code> 00.00.00 to
     * <code>endDates</code> 23.59.59.
     */
    public Map<LocalDate, IterationHistoryEntry> getHistoryEntriesForIteration(
            Iteration iteration);
    
    
}